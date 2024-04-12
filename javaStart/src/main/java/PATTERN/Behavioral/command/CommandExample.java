package PATTERN.Behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class CommandExample {
    public static void main(String[] args) {
        Reciever reciever = new Reciever();
        reciever.addCommand(new MouseClick());
        reciever.addCommand(new MousePress());
        reciever.runCommand();

    }
}

interface Command{
    void execute();
}

class MouseClick implements Command{
    @Override
    public void execute() {
        System.out.println("click command");
    }
}

class MousePress implements Command{
    @Override
    public void execute() {
        System.out.println("click press");
    }
}

class Reciever {
    List<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        commands.add(command);
    }

    void runCommand() {
        for (Command command : commands) {
            command.execute();
        }
    }
}