package au.com.tyo.json;

import com.google.api.client.util.Key;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 17/7/17.
 */

public class JsonFormFieldOptions extends JsonFormField {

    @Key
    public String label = "";

    @Key
    public List<JsonFormFieldOption> options;

    public JsonFormFieldOptions(String key, String type, String hint) {
        super(key, type);
        this.label = hint;
    }

    protected JsonFormFieldOption addOption(JsonFormFieldOption option) {
        if (options == null)
            options = new ArrayList<>();
        options.add(option);
        return option;
    }

    public JsonFormFieldOption addOption(String key, String text) {
        JsonFormFieldOption option = new JsonFormFieldOption(key, text);
        return addOption(option);
    }

    public void check(List<String> list) {

    }
}
