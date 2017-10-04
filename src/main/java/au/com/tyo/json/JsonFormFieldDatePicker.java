package au.com.tyo.json;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 14/9/17.
 */

public class JsonFormFieldDatePicker extends JsonFormFieldButton {

    public JsonFormFieldDatePicker(String key, String title) {
        super(key, Constants.JSON_FORM_WIDGET_KEY_DATE_PICKER, title, PICK_DATE);
    }

    public JsonFormFieldDatePicker(String key, String title, int pickType) {
        this(key, title, pickType, REQUIRED);
    }

    public JsonFormFieldDatePicker(String key, String title, int pickType, String hint) {
        super(key, Constants.JSON_FORM_WIDGET_KEY_DATE_PICKER, title, pickType);
        this.hint = hint;
    }
}