package au.com.tyo.json.jsonform;

import com.google.api.client.util.Key;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 17/7/17.
 */

public class JsonFormField implements Comparable<JsonFormField> {

    public static final String REQUIRED = "Required";

    public static final int VALUE_NULLABLE = -1;
    public static final int VALUE_OPTIONAL = 0;
    public static final int VALUE_REQUIRED = 1;

    public static final int CLICKABLE_NONE = 0;
    public static final int CLICKABLE_FIELD = 1;
    public static final int CLICKABLE_ROW = 2;

    public static final String ATTRIBUTE_NAME_LAYOUT = "layout";
    public static final String ATTRIBUTE_NAME_CLICKABLE = "clickable";
    public static final String ATTRIBUTE_NAME_VISIBLE = "visible";
    public static final String ATTRIBUTE_NAME_VALUE = "value";
    public static final String ATTRIBUTE_NAME_ORIENTATION = "orientation";
    public static final String ATTRIBUTE_NAME_REQUIRED = "required";
    public static final String ATTRIBUTE_NAME_ENABLED = "enabled";
    public static final String ATTRIBUTE_NAME_KEY = "key";
    public static final String ATTRIBUTE_NAME_TITLE = "title";
    public static final String ATTRIBUTE_NAME_SUB_TITLE = "subtitle";
    public static final String ATTRIBUTE_NAME_TYPE = "type";
    public static final String ATTRIBUTE_NAME_SEPARATOR_UNDER = "separator_under";

    public static final String ATTRIBUTE_NAME_SCROLLABLE = "scrollable";
    public static final String ATTRIBUTE_NAME_EXTERNAL_VALIDATOR = "has_validator";

    public static final String VALUE_NAME_ORIENTATION_VERTICAL = "vertical";
    public static final String VALUE_NAME_ORIENTATION_HORIZONTAL = "horizontal";

    /**
     *
     */
    protected static String widgetType = null;

    public static void setWidgetType(String widgetType) {
        JsonFormField.widgetType = widgetType;
    }

    @Key
    public String key;

    @Key
    public String type;

    @Key
    public String visible = "true";

    @Key
    public Object value;

    /**
     * for form validation
     */
    public int required = VALUE_NULLABLE; // -1 nullable, 0 optional, 1 required

    /**
     * the orientation of field like title, user input
     */
    @Key
    public String orientation;

    /**
     * Other attributes in json
     */
    @Key
    public String attributes;

    /**
     * For dipslay order
     */
    public int display_order;

    /**
     * Response to mouse click event
     *
     * 0, false
     * 1, true
     * 2, clickable on row level
     */
    @Key
    public int clickable;

    /**
     * If it is the field enabled
     * for EditText, is it editable
     */
    @Key
    public boolean enabled;

    /**
     * The resource for generating the field layout
     *
     * e.g. in Android, layout = R.layout.field_awesome
     */
    @Key
    public int layout;

    /**
     * Indicate if there is separator / divider under
     */
    @Key
    public boolean separator_under = true;

    public JsonFormField(String key, String type, boolean required) {
        this.key = key;
        this.type = type;
        this.required = required ? VALUE_REQUIRED : VALUE_NULLABLE;
        this.clickable = 0;
        this.enabled = true; // by default, yes

        // if (null == type)
        //     throw new IllegalStateException(this.getClass().getSimpleName() + ": widget type cannot not be null");
    }

    public JsonFormField(String key) {
        this(key, widgetType, false);
    }

    @Override
    public int compareTo(JsonFormField jsonFormField) {
        return Integer.compare(this.display_order, jsonFormField.display_order);
    }
}
