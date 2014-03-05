//    Openbravo POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://www.openbravo.com/product/pos
//
//    This file is part of Openbravo POS.
//
//    Openbravo POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Openbravo POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.
package fr.pasteque.pos.ticket;

import java.io.Serializable;
import org.json.JSONObject;

/**
 *
 * @author adrianromero
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 7537578737839L;
    private String m_sId;
    private String m_sName;

    /** Creates a new instance of UserInfoBasic */
    public UserInfo(String id, String name) {
        m_sId = id;
        m_sName = name;
    }

    public JSONObject toJSON() {
        JSONObject o = new JSONObject();
        o.put("id", this.m_sId);
        o.put("name", this.m_sName);
        return o;
    }

    public String getId() {
        return m_sId;
    }

    public String getName() {
        return m_sName;
    }
}