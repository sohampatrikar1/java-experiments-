public class Cube
{
    int side;

    Cube()
    {
        side = 2;
    }

    Cube(int s)
    {
        side = s;
    }

    void volume()
    {
        System.out.println("Volume = " + (side * side * side));
    }

    public static void main(String args[])
    {
        Cube c1 = new Cube();
        Cube c2 = new Cube(4);

        c1.volume();
        c2.volume();
    }
}