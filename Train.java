
import java.io.*;


public class Train extends Ticket {
    String Date;
    String Trainname;
    String PNR;
    String Destination;
    String Origin;
    String ModeOfTransport;
    String name;
    
    Train(String name, String Date, String ModeofTransport, String Trainname, String PNR, String Destination,
            String Origin) {
        this.name = name;
        this.Date = Date;
        this.PNR = PNR;
        this.Trainname = Trainname;
        this.Destination = Destination;
        this.Origin = Origin;
        this.ModeOfTransport = ModeofTransport;
    }

    void add() throws FileNotFoundException {
        try {
            File f = new File("C:\\Users\\anura\\Documents\\Booking Management\\src\\data.csv");
            FileWriter writer = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.newLine();
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(',');
            sb.append(Date);
            sb.append(',');
            sb.append("Train");
            sb.append(',');
            sb.append(Trainname);
            sb.append(',');
            sb.append(PNR);
            sb.append(',');
            sb.append(Origin);
            sb.append(',');
            sb.append(Destination);
            sb.append('\n');
            writer.write(sb.toString());
            writer.close();
        } catch (IOException E) {
            System.out.println("ERROR");
        }
    }
}