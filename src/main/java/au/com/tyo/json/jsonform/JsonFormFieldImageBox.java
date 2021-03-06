/*
 * Copyright (c) 2017 TYONLINE TECHNOLOGY PTY. LTD. (TYO Lab)
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

package au.com.tyo.json.jsonform;

import com.google.api.client.util.Key;

import java.util.ArrayList;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 22/12/17.
 */

public class JsonFormFieldImageBox extends JsonFormField {

    @Key ArrayList images;

    public JsonFormFieldImageBox(String key) {
        super(key);
    }

    public void addImage(String imageUrl) {
        if (images == null)
            images = new ArrayList<String>();
        images.add(imageUrl);
    }
}
