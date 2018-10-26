package com.codewr.example.behavioral.chain.of.responsibility.pattern;

/**
 *
 * @author codewr
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
