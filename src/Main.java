public static void main(String[] args) {
    BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");

    AddressBook addressBook = new AddressBook();
    addressBook.addBuddy(buddy);
    addressBook.removeBuddy(0);
}