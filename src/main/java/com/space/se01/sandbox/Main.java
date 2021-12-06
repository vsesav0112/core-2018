package com.space.se01.sandbox;

public class Main {
    static void giveInformationAboutClient(Object client) {
        if (client instanceof PhysicalPerson) {
            ((PhysicalPerson)client).giveInformation();
        } else if (client instanceof Company) {
            ((Company)client).giveInformation();
            ((Company)client).corporateDiscount();
        } else if ((client instanceof Client)) {
            ((Client)client).giveInformation();
        } else {
            System.out.println("Parameter which was passed in the method is not instance of any of class: Client, PhysicalPerson, or Company!");
        }

    }

    public static void main(String[] args) {
        giveInformationAboutClient(new Client(1));
        System.out.println();
        giveInformationAboutClient(new PhysicalPerson(2, "Ivan", "Petrov"));
        System.out.println();
        giveInformationAboutClient(new Company(3, "OOO 'Company'", "St. Petersburg", 15));
        System.out.println();
        giveInformationAboutClient(null);

        /*Client a = new Company(1, "OOO", "NY", 10);
        // a.corporateDiscount(); //Не можем использовать метод, так как объект был объявлен как CLient, нужно скастить
        ((Company) a).corporateDiscount();

        Client b = new Client(1);
        PhysicalPerson c = (PhysicalPerson)b;*/

        PhysicalPerson d = new PhysicalPerson(1, "Name", "Surname");
        System.out.println(d);

    }
}

class Client {
    int id;

    public Client(int id) {
        this.id = id;
    }

    public void giveInformation() {
        System.out.println("Id: " + this.id);
    }
}

class PhysicalPerson extends Client{
    String name;
    String surname;

    public PhysicalPerson(int id, String name, String surname) {
        super(id);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void giveInformation() {
        System.out.println("Id: " + this.id + "\n" + "Name: " + this.name + "\n" + "Surname: " + this.surname);
    }

    @Override
    public String toString() {
        return "id: " + super.id + "\n" +
                "Name: " + name + "\n"  +
                "Surname: " + surname;
    }
}

class Company extends Client {
    String companyName;
    String address;
    int corporateDiscount;

    public Company(int id, String companyName, String address, int corporateDiscount) {
        super(id);
        this.companyName = companyName;
        this.address = address;
        this.corporateDiscount = corporateDiscount;
    }

    @Override
    public void giveInformation() {
        System.out.println("Id: " + this.id + "\n" + "Company name: " + this.companyName + "\n" + "Address: " + this.address);
    }

    public void corporateDiscount() {
        System.out.println("Corporate discount: " + this.corporateDiscount);
    }
}
