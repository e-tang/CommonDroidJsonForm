package au.com.tyo.json;

import com.google.api.client.util.Key;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 17/7/17.
 */

public class JsonFormFieldButton extends JsonFormFieldTitledLabel {

    public static final int PICK_NONE = -1;

    public static final int PICK_FROM_LIST = 0;

    public static final int PICK_DATE = 1;

    @Key
    public String listener;

    @Key
    private String pick;

    public JsonFormFieldButton(String key, String type, String title, int pickType) {
        super(key, type, title, "");
        setPick(pickType);
    }

    public JsonFormFieldButton(String key, String title, int pickType) {
        this(key, Constants.JSON_FORM_WIDGET_KEY_BUTTON, title, pickType);
    }

    public JsonFormFieldButton(String key, String title) {
        this(key, title, PICK_NONE);
    }

    public int getPick() {
        return Integer.valueOf(pick);
    }

    public void setPick(int type) {
        this.pick = String.valueOf(type);
    }
}