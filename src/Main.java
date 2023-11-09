import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            //Customer
            ArrayList<Customer> listCustomer =new ArrayList<>();
            Customer newCustomer= new Customer();
            newCustomer.setId(627637464);
            newCustomer.setName("Karla");
            newCustomer.setSurname("Vergara");
            newCustomer.setAdress("Calle Inventada");
            listCustomer.add(newCustomer);
            Customer newCustomer1= new Customer();
            newCustomer1.setId(875976732);
            newCustomer1.setName("Luisa");
            newCustomer1.setSurname("González");
            newCustomer1.setAdress("Calle Nueva");
            listCustomer.add(newCustomer1);
            //Vehicle
            ArrayList<Vehicles> listVehicles =new ArrayList<>();
            Vehicles newVehicles= new Vehicles();
            newVehicles.setLicensePlate(984564623);
            newVehicles.setBrand("Opel");
            newVehicles.setModel("X");
            newVehicles.setColour("Black");
            newVehicles.setEngine("Motorinventado");
            newVehicles.setFuelType("diesel");
            newVehicles.setHorsePower("3000");
            //Sales Data
            ArrayList<SalesData> listSalesData =new ArrayList<>();
            SalesData newSalesData= new SalesData();
            newSalesData.setSaleCode(01);
            newSalesData.setSaleDate(02032023);
            newSalesData.setCustomerData("Karla Vergara");
            newSalesData.setVehicleData("Opel");
            newSalesData.setPaymentForm("Card");
            newSalesData.setSalePrice(5.000);
            }
}