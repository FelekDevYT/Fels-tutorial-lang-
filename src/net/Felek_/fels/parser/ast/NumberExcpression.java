package net.Felek_.fels.parser.ast;

public class NumberExcpression implements Expression{
    private final double value;
    
    public NumberExcpression(double value) {
        this.value = value;
    }

    @Override
    public double eval() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
