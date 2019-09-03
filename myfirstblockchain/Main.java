import java.util.Arrays;
public class Main {
public static void main(String []args)
{
String[] block1Transactions = {"Satoshi sent 100 bitcoin to Ayoun","Nakamoto sent 10 bitcoins to Ayoun"};
Block block1 = new Block(0,block1Transactions);

String[] block2Transactions = {"Ayoun sent 1 bitcoin to Satoshi","Ayoun sent 10 bitcoins to Nakamoto"};
Block block2 = new Block(block1.getBlockHash(),block2Transactions);

String[] block3Transactions = {"Ayoun sent 5 bitcoins to Starbucks"};
Block block3 = new Block(block2.getBlockHash(),block3Transactions);

System.out.println("Digital Signature of First Block");
System.out.println(block1.getBlockHash());

System.out.println("Digital Signature of Second Block");
System.out.println(block2.getBlockHash());

System.out.println("Digital Signature of Third Block");
System.out.println(block3.getBlockHash());

}
}
