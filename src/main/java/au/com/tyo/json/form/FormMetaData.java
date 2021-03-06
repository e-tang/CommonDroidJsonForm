/*
 * Copyright (c) 2018 TYONLINE TECHNOLOGY PTY. LTD. (TYO Lab)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package au.com.tyo.json.form;

import java.util.Comparator;
import java.util.Map;

import au.com.tyo.json.jsonform.JsonForm;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 2/1/18.
 */

public class FormMetaData extends DataJson {

    public boolean isVisible() {
        if (containsKey(JsonForm.FORM_META_KEY_VISIBLE)) {
            return (boolean) get(JsonForm.FORM_META_KEY_VISIBLE);
        }
        return false;
    }

    public int getDisplayOrder() {
        return getDisplayOrder(this);
    }

    public static int getDisplayOrder(Map map) {
        return (int) map.get(JsonForm.FORM_META_KEY_DISPLAY_ORDER);
    }

    public static class DisplayOrderComparator implements Comparator<Map> {

        @Override
        public int compare(Map m1, Map m2) {
            int o1 = getDisplayOrder(m1);
            int o2 = getDisplayOrder(m2);

            if (o1 == o2)
                return 0;
            else if (o1 > o2)
                return 1;
            else
                return -1;
        }
    }
}
