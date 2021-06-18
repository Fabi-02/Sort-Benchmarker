package sort.options;

public class SortOption {

    private String option;
    private OptionType optionType;
    private Object defaultValue;

    private Object value;

    public SortOption(String option, OptionType optionType, Object defaultValue) {
        this.option = option;
        this.optionType = optionType;
        this.defaultValue = defaultValue;
        this.value = defaultValue;
    }

    public String getOption() {
        return option;
    }

    public OptionType getOptionType() {
        return optionType;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
