package CompositePattern;

public class Room implements IStructure{
    public String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("You have entered the " + this.getName());
    }

    @Override
    public void exit() {
        System.out.println("You have left the " + this.getName());
    }

    @Override
    public void location() {
        System.out.println("You are currently in the" + this.getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
