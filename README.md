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
