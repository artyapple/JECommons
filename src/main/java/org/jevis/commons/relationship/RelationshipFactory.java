/**
 * Copyright (C) 2014 Envidatec GmbH <info@envidatec.com>
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
package org.jevis.commons.relationship;

import org.jevis.api.JEVisClass;
import org.jevis.api.JEVisClassRelationship;
import org.jevis.api.JEVisConstants;
import org.jevis.api.JEVisException;

/**
 * The Class helps building the most commen types of JEVisClassRealtionships
 * between JEVisClasses.
 *
 * @author Florian Simon <florian.simon@envidatec.com>
 */
public class RelationshipFactory {

    /**
     * Build an inheritance relationship between an superclass and its inherit
     * subclass
     *
     * @param superclass The superclass where the subclass is inherit its
     * attributes from.
     * @param subclass The subclass which inherit the attributes from the
     * suberclass.
     * @return The new JEVisClassRealtionship between this classes
     * @throws org.jevis.api.JEVisException
     */
    public static JEVisClassRelationship buildInheritance(JEVisClass superclass, JEVisClass subclass) throws JEVisException {
        return superclass.buildRelationship(subclass, JEVisConstants.ClassRelationship.INHERIT, JEVisConstants.Direction.BACKWARD);
    }

}
