
def encrypt(key, msg):

def decrypt(key, msg):
    
select = raw_input("Would you like to encrypt or decrypt? ")
if(select == "encrypt"):
    message = raw_input("Enter your message: " )
    key = raw_input("Enter your key: ")
    encrypt(key, message)
if(select == "decrypt"):
    encryption = raw_input("Enter the encryption: ")
    key = raw_input("Enter the key: ")
    decrypt(key, encryption)

