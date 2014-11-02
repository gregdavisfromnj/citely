/**
 *  Copyright 2014 Gregory J. Davis
 *
 *  This file is part of Citely.
 *  Citely is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Citely is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Citely.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.blueclawsoft.citely.common;


/**
 * A PublicationType, serving as an enumeration mapping from integer/id
 * to string/name.  This declares what type a publication is being
 * referenced.
 */
public class PublicationType {

    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

            /*
                new Enum("article", INT_ARTICLE),
                new Enum("book", INT_BOOK),
                new Enum("booklet", INT_BOOKLET),
                new Enum("conference", INT_CONFERENCE),
                new Enum("inbook", INT_INBOOK),
                new Enum("incollection", INT_INCOLLECTION),
                new Enum("inproceedings", INT_INPROCEEDINGS),
                new Enum("manual", INT_MANUAL),
                new Enum("mastersthesis", INT_MASTERSTHESIS),
                new Enum("misc", INT_MISC),
                new Enum("phdthesis", INT_PHDTHESIS),
                new Enum("proceedings", INT_PROCEEDINGS),
                new Enum("techreport", INT_TECHREPORT),
                new Enum("unpublished", INT_UNPUBLISHED),
          */

}
