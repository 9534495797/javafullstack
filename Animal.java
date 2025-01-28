 interface AnonymousPractice {
    void makesound();
}

public class Animal {
    public static void main(String[] args) {
        AnonymousPractice ab = new AnonymousPractice() {
            @Override
            public void makesound() {
                System.out.println("The dog says woof woof!");
            }
        };

        ab.makesound();
    }
}
