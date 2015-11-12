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
package org.jevis.commons.driver;

import java.util.Map;
import org.jevis.api.JEVisDataSource;
import org.jevis.api.JEVisObject;

/**
 *
 * @author Broder
 */
public class ImporterFactory {

    public static Importer getImporter(JEVisObject _dataSourceJEVis) {
        return new JEVisImporter();
    }

    public static void initializeImporter(JEVisDataSource _client) {
    }

    public static void setImporterClasses(Map<String, Class> parserClasses) {
    }

}
