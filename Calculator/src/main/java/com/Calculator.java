package com;

public class Calculator {
    private int id;
    private int input1;
    private int input2;

    public int getInput1() {
        return input1;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "id=" + id +
                ", input1=" + input1 +
                ", input2=" + input2 +
                ", result=" + result +
                '}';
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int result;


}
