# scala-akka-101
    
Project to show my Scala learning adventure    
    
    A simple project to show the interactions between a Class of Student Instances and a Class of College Instances.     
        
        ( Please excuse the project structure :) )
        
        TODO List
        * Define methods for the College Class
        * Segregate College Operations and Student Operations
        * Work in Akka
        * Update Testing and add Complexity
        
        
        
        Change Log 
        *   2/11/16 Refactor: 0.8
            - Simplified collegeOps and studentOps methods
            - Updated Main.scala to simplify the method calls and rename values
        
        *   2/9/16 Addition: version 0.7.1
            - added an Observable method to get the students.csv file
        
        *   2/6/16 Refactor: version 0.7
            - created StudentAttr trait to fix issue with generateIdString and generateGpa function
                * Functions were only evaluating once and kept the same value for every subsequent class object
            - created the setId function in studentOps.scala, to generate the random string id    
            - changed name of function generateDouble to generateGpa
            
        *   2/4/16 Refactor: version 0.6.1
            - changed name of acceptanceToCollege method to canBeAccepted 
        
        *   2/4/16 Refactor: version 0.6
            - Moved random double generator to the optools.utils object
            - Created a new services directory to segregate methods on College and Student objects
            - Removed future from gpa generator
            - updated methods:
                - addStudentToCollege
                - removeStudentFromCollege
            - new methods:
                - updateGpa
                - acceptanceToCollege
        
        *   2/4/16 Major refactor: version 0.5 
            - Use of Case Classes instead of Regular Classes and SubClasses
            - Moved random # generator functionality to the optools.utils object
            - Moved static data to optools.assets
            - Moved methods on students to optools.studentOps
