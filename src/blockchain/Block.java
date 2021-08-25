package blockchain;

import java.util.Arrays;

public class Block {

    private int previousHash;
    private String[] transaction;
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transaction = transactions;

        Object[] contents = new Object[] {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transaction;
    }

    public int getBlockHash() {
        return blockHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "blockHash=" + blockHash +
                '}';
    }
}
