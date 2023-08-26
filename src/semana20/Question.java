package semana20;

import java.util.Map;

public abstract class Question {
    private int number;
    private String statement;
    protected Map<String, Boolean> options;

    public Question(int number, String statement, Map<String, Boolean> options) throws IllegalArgumentException {
        setNumber(number);
        setStatement(statement);
        setOptions(options);
    }

    public int getNumber() {
        return number;
    }

    public String getStatement() {
        return statement;
    }

    private void setNumber(int number) throws IllegalArgumentException {
        if (number <= 0) throw new IllegalArgumentException();
        this.number = number;
    }

    private void setStatement(String statement) throws IllegalArgumentException {
        if (statement.length() == 0) throw new IllegalArgumentException();
        this.statement = statement;
    }

    public Map<String, Boolean> getOptions() {
        return this.options;
    }

    protected abstract void setOptions(Map<String, Boolean> options);

    public abstract boolean choice(String text);
    public abstract boolean choice(String[] texts);
}
