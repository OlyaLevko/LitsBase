package HomeworkThree;

public enum Status {
    START,
    FLY,
    STOP;

    void status(){
        switch (this) {
            case START:
                System.out.println("The rocket was launched.");
                break;
            case FLY:
                System.out.println("The rocket has being flaying.");
                break;
            case STOP:
                System.out.println(" The rocket has gotten to the ISS.");
                break;
            default:
                System.out.println("Something went wrong with a rocket status.");
        }

    }
}
