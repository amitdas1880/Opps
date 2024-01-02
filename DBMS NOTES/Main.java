                                
                                DATA BASE MANAGEMENT SYSTEM (DBMS)
                                
Data - Data is the term of bit & bytes which dose not have a specific meaning.
       in other word data itself has no meaning, it became meaningful when it's get processed.
       
       https://docs.google.com/document/d/1-vvuFFwsPk7b4C-sHPhe6fYtZirCneN-/edit
       
       Types of data :- 
       Quantitative : i.Numerical form 
                     ii.Weight, volumn,Cost of an Item.
        Qualitative :i.Description not an numerical.
                    ii.Name, gender,hair of the colour.
                    
DataBase :- Database is a electronic location in your computer hard drive,where you can 
            store all the information. From that electronic location you can access your data,you can add 
            your data,you can update your data and you can remove your data.
        
    DBMS :- Data Base Management System is basically a software . It provide some functionality/methods
            Which  help you to access your data, add your data, update  your data, remove  your data , you can
            maintain your data consistancy.
            From this DBMS you can create new Data base.
            Example od DBMS :
            1.Mysql 2.MongoDB 3.OracleDBMS 4. IBM DB 5.Microsoft SQL Server.
            
            In which cause Data Base Management System is introduce :- (Disadvantage of file system)
            1.Data Redundancy Or data inconsistancy.
            
            2.Data concurrency. (Multiple people can excess data at a same time , they can RR,RW,WW . if thousand of user can 
                                access the file at a time , there will come data concurrency or we can say inconsistancy. 
                                To overcome this problem DBMS, has some protocal).
            3.Security problems in file System. 
            4.DBMS help to fast searching and memory utilisation very less. 
            
            Different Between File System and DBMS
            https://www.geeksforgeeks.org/difference-between-file-system-and-dbms/
            
            Youtube
            https://www.youtube.com/watch?v=ZtVw2iuFI2w
            
Data Models :- Data models is a collection of concept that can be used to describe the structure of the Database,
               which includes Data type, Relationship and constraints (Ruls & Regulation) that apply on the data.
               
  ER Digram :- ER stand for Entity Relationships digram.
               ER digram can excess the overall logical structure of the database graphically.
               ER digram is used to define the relationship with the data elements for a specific systems.
               
               
  
  ER Models :- ER Models stand for  Entity-Relationship Model. Which represents the structure of the
               database with the help of a diagram. ER Modelling is a systematic process Which design
               a database according to the requirements before implementing your database.
               
               Creating an ER Model in DBMS is considered a best practice before implementing your 
               database because it makes it easier for the developers to understand the database .
               
               
     Entity :- Entity in DBMS is a real-world object.
               An entity is a piece of data that is stored in the database.
               For example, in a College database, the entities can be Professor detail,
               Students detail, Courses detail etc.
               1.Strong Entity :- A strong entity is an entity that is not dependent on any
                                  other entity. It has a primary key. it Can be uniquely identified.


               2.Weak Entity :- A weak entity is dependent  on some strong entity.it Can’t be uniquely identified. 
                                It has to depend on other entities to ensure its existence.
    
    Entity set :- An entity set is a group of distinct entities that have the same properties.
                  For example, a customer entity might have the name, address, and phone number attributes.
                  
    Attributes:- In a database management system (DBMS), an attribute is a piece of data that describes
                 an entity. 
                 For example, in a customer database, the attributes might be name, address, and phone number. 
                 In a product database, the attributes might be name, price, and date of manufacture. 
                 Each attribute has a specific data type, such as string, integer, or date. 
                  
    Types of Attributes :- 
    1. Simple Attributes:- Simple attributes are those that cannot be further divided into sub-attributes.
                           Eg, Customer’s account number in a bank, Student’s Roll number etc.
                           
    2.Composit Attributes:- composit Attributes  Can be divided into subparts.
                            E.g., Name of a person, can be divided into first-name, middle-name, last-name.
                            E.g., Address can also be divided, street, city, state, PIN code.
    3. Single-valued Attributes :- Single-valued attributes can only have one value.
                            E.g., Student ID,age,DOB,gender etc.
                            
    4.Multivalued Attributes :- Multivalued attributes can have more than one value. 
                                E.g., phone-number, nominee-name on some insurance, dependent-name etc.
    5.Derived Attributes :- Derived attributes are based on other attributes and are not stored directly 
                            in the database.
                            For example: Consider a database of employees. Each employee has a date of birth,
                            and we might want to calculate their age. However, age is a derived attribute 
                            because it can be determined from the date of birth. As such, it would not make 
                            sense to store it directly in the database.
                            
    Key:- A key is a attribute or a set of attributes which uniquely identifies any record from the table.
    
    perpose of key:- 
    1.key is use to  uniquely identifies any records or row of  data from the table.
    2. It also use to establise or identify any relationships between tables.
    
    
    1.Super key :-  A Super key is an attribute or set of attribute which can uniquely identifies any records 
                    A super key is a superset of a candidate key. it have atlist one candidate or more candidate key.
                    
    2.Candidate key:- A Candidate key is an attribute or set of attribute which can uniquely identifies any records .
                      i.  The value of a candidate key cannot be Null.
                    
    3.primary key :- A primary key generally focuses on the uniqueness of the table. 
                     It assures the value in the specific column is unique.	
                      i. The value of primary key can never be Null.
                     ii.The value of primary key must always be unique(No Deplication).
                    iii.The value of primary key can never be changed. (Not updation is possible).
                     vi. The table allows only one primary key.	
                     
    4.Alternate key:- Out of all candidate keys only one key gets selected as primary key and
                      remaining keys are known as Alternate keys.
                      
    5.Foreign key :- i. A foreign key is generally used to build a relationship between the two tables.
                    ii.Foreign key is an attribute or set of attribute in one table that refers to 
                       primary key in another table.
                   iii.The value of foreign key may be or may not be Null.
                    vi.The value of foreign key must not be unique (may be Deplication value).
                    
    ACID properties:- 
        1.Atomicity:-When we perform any operation it should executed completely ,means it should 
                     execute from stating point to ending point completely. If any resone the execution
                     of the operation fail, the operation will again start from starting point .
                     eg: Google pay UPI payment.
        2.consistancy :- 
        3.isolation:- 
        4.Durability:-

    Abstraction in DBMS:-
        1. Physical or Internal Level:- The physical or internal layer is the lowest level of data abstraction in 
                                        the database management system. It is the layer level that defines how data
                                        is actually stored in the database. It defines methods to access the data
                                        in the database. It defines complex data structures in detail, 
                                        so it is very complex to understand. 
                                        
        2. Logical or Conceptual Level:-The logical or conceptual level is the intermediate or next level of
                                        data abstraction. t describes the structure of the entire data in the
                                        form of tables. The logical level or conceptual level is less complex 
                                        than the physical level.
                                        
        3. View or External Level:-View or External Level is the highest level of data abstraction. 
                                   This level is for the end-user interaction; at this level, users
                                   can access the data based on their queries.






