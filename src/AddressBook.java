import java.util.ArrayList;
// Address book developed for SYSC 3110.
// This change was made through GitHub.
public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            myBuddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }

        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo(
                "Tom",
                "Carleton",
                "613"
        );

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
