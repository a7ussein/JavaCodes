public class EqualNotEqual{
    public static void main(String[] args){
        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumlengthB = 53;
    //this boolean is supposed to print ture because songsA and songsB have the same number
    boolean sameNumberOfSongs = songsA == songsB;
    //this boolean is supposed to print weather the two album lengths are not the same
    boolean differentLength = albumLengthA != albumlengthB;

System.out.println(sameNumberOfSongs);
System.out.println(differentLength);

    }
}