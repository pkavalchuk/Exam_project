package by.stormnet.core.utils;

public enum PauseLength {
    MAX(15),
    AVG(7),
    MIN(5);


    private Integer value;

    PauseLength(Integer value) {
        this.value = value;
    }

    public Integer value(){
        return this.value;
    }
}
