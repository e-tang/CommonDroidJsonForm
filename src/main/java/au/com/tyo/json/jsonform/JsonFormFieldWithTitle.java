package au.com.tyo.json.jsonform;

import com.google.api.client.util.Key;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 17/7/17.
 */

public class JsonFormFieldWithTitle extends JsonFormFieldEditable {

    @Key
    public String title;

    public JsonFormFieldWithTitle(String key, String title) {
        super(key);
        this.title = title;
    }

}
