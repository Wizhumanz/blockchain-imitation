package blockchain;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
	// write your code here
        ArrayList<Block> blockchain = new ArrayList<>();

        String[] genesisTransactions = {"Simon sent 5 bitcoin to Daniel", "Aiden sent 10 bitcoin to Albert"};
        Block genesisBlock = new Block(0,genesisTransactions);
        blockchain.add(genesisBlock);

        String[] transactionsOne = {"Simon sent 10 bitcoin to John", "Harry sent 2 bitcoin to Anson"};
        Block blockOne = new Block(genesisBlock.getBlockHash(),transactionsOne);
        blockchain.add(blockOne);

        String[] transactionTwo = {"Paul sent 12 bitcoin to Michelle", "Sophia sent 10 bitcoin to Karl"};
        Block blockTwo = new Block(blockOne.getBlockHash(),transactionTwo);
        blockchain.add(blockTwo);
        System.out.println(blockchain.toString());
    }
}
