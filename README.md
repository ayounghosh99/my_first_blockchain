# my_first_blockchain
my_first_blockchain in Java using hash code



This simple Blockchain was made using hash codes in Java, this code demonstartes the concept of Blockchain that powers almost all the modern cryptocurrencies while at the same time being very simple at it's core. 

The hash used in this code is actually not considered as a Digital Signature (i have simply assumed it to be one, consider it to be more like a digital fingerprint than that of a Digital Signature), the actual Digital Signature is a hash encrypted with the private key whereas my code only deals with the public key.


As Evident from the code, the Digital Signature/Fingerprint of all the blocks and the transactions in them get's changed automatically if any changes are made in any transaction, all the blocks and thier Signatures are interlinked with each other so any false updates to this blockchain can be detected by tallying the signatures with other copies of this blockchain, this is no way near as secured or efficient as the blockchain used in cryptocurrencies but it's a step towards that path.
