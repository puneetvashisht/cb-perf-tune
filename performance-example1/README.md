## Getting Started

    Book Reference
    Java 9 High Performance
        By Mayur Ramgir , Nick Samoylov


    #Print Compilation Details
    java -XX:+PrintCompilation App 5000

    #Tweak Code Cache Size to optimize program - use case: frequent calls to some methods resulting in increased code cache size
    'C:\Program Files\Java\jdk1.8.0_202\bin\java.exe' -XX:ReservedCodeCacheSize=28m -XX:+PrintCodeCache App 50000
    ReservedCodeCacheSize
    InitialCodeCacheSize


    Print all JVM flags with default values using : java -XX:+PrintFlagsFinal

    Shortcut: jps-> get the processes
    jinfo wid pid to get specific flag for that process
    jinfo -flag <name_flag> pId

    Instructions for exercise
    1. CompileThreshold=1000
    2. jps -- find pId
    3. jinfo -flag CompileThreshold pId 




