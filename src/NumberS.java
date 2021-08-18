class NumberS {

    private final int value;
    private final NumberT type;

    NumberS(int value, NumberT type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    NumberT getType() {
        return type;
    }
}