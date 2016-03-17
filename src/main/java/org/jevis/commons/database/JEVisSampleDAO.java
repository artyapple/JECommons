/**
 * Copyright (C) 2015 Envidatec GmbH <info@envidatec.com>
 *
 * This file is part of JECommons.
 *
 * JECommons is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation in version 3.
 *
 * JECommons is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * JECommons. If not, see <http://www.gnu.org/licenses/>.
 *
 * JECommons is part of the OpenJEVis project, further project information are
 * published at <http://www.OpenJEVis.org/>.
 */
package org.jevis.commons.database;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.jevis.api.JEVisAttribute;
import org.jevis.api.JEVisObject;
import org.jevis.api.JEVisSample;
import org.joda.time.DateTime;

/**
 *
 * @author broder
 */
public class JEVisSampleDAO {

    @Inject
    private JEVisAttributeDAO attributeDao;

    @Inject
    public JEVisSampleDAO(JEVisAttributeDAO attributeDao) {
        this.attributeDao = attributeDao;
    }

    public JEVisSample getLastJEVisSample(JEVisObject dataObject, String attributeName) {
        JEVisAttribute jeVisAttribute = attributeDao.getJEVisAttribute(dataObject, attributeName);
        JEVisSample lastSample = null;
        if (jeVisAttribute != null) {
            lastSample = jeVisAttribute.getLatestSample();
        }
        return lastSample;
    }

    public List<JEVisSample> getSamplesInPeriod(JEVisObject dataObject, String attributeName, DateTime from, DateTime until) {
        List<JEVisSample> allSamples = new ArrayList<>();
        JEVisAttribute jeVisAttribute = attributeDao.getJEVisAttribute(dataObject, attributeName);
        if (jeVisAttribute != null) {
            jeVisAttribute.getSamples(from, until);
        }
        return allSamples;
    }
}
