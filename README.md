#UNFINISHED, FEEDBACK REQUESTED

Not sure if this is 'working' as intended; feedback requested!

# kata-3-ubiquitous-language
Designing code with a focus on the Ubiquitous Language of the underlying business domain.

In this kata, we'll try to understand the problem and code the solution using only the terms used by our Subject Matter Expert. No matter how silly they may sound!

# But Why???

Domain-driven design's primary strategic contribution is its emphasis on using the domain language of the business, not of the computer, when crafting code. This makes the intent of the code more obvious with respect to the business domain. Doing this takes some concentration and discipline, and the occasional insightful question, but the result is code that describes the solution in domain terms, thus embedding our understanding of the business into the domain model.

##Instructions for Using this Repo

This kata is unusual, in that there is nothing to refactor; it starts with a blank project, a few words from our imaginary Subject Matter Expert, and a hint for the starting place for some domain modeling and unit tests.

Subsequent steps engage with our SME for more details, building up the domain model incrementally.

The challenge is to absorb the business terminology, understand the requisite processes, and reflect that understanding in the code.

To use this repo, clone it locally. It should "just work" if you open it using IntelliJ IDEA. If you're using Eclipse, you'll have to import it into your workspace:

    File > Import > General > Existing Projects into Workspace
    then choose the kata's root directory

Notes: 

  * after you change branches (see step 2 below) you may need to refresh the eclipse project (right-click > Refresh). IntelliJ seems to do this automatically.
  * the first time you open the project in IntelliJ, it may complain about "Unregistered VCS root detected", if so just click 'Ignore'

The only dependency is on JUnit, which should be handled by the IntelliJ/Eclipse project files already.

This repo includes several branches, progressing through each change step. Start with the original code branch (see below) and follow the @STEP-1.TXT instructions to modify it as suggested. Then compare your results to the next branch, and so on, until the end.
 
###Example:

    1. clone the repo locally:

```
        git clone https://github.com/.../kata-3-ubiquitous-language.git
```

    2. CD to the source directory and switch to the first branch, named STEP-1 (yes, uppercase matters)
    
```
        cd kata-3-ubiquitous-language
        git checkout STEP-1
```

    3. make sure the code builds and the unit tests pass (JUnit is the only dependency, v4.12)
    4. read the instructions for each step (e.g. @STEP-1.TXT in this case)
    5. modify the code as instructed
    6. run the unit tests (make them pass if they fail; kudos if you refactored carefully enough to not break the tests!)
    7. OPTIONAL BUT FUN: compare your changes to the next branch
    
```
        git diff STEP-1..STEP-2
```

    8. switch to the next branch (named STEP-2, STEP-3, ...) and repeat from #2 above
       NOTE: if you've made changes, git will whine at you when you try to switch branches; 
             commit or stash your changes to make it shut up
    9. PROFIT! (metaphorically)

##Goals
The goal of this exercise is to experience a brief but intense and hopefully amusing and enlightening domain-driven design session in a strange (and somewhat silly) business domain. The choice of nearly nonsensical domain terminology is intentional, to prevent you from "leaping ahead" to a solution without taking the time to absorb the domain terminology.

##Roadmap

We will work out our domain model in incremental steps after brief discussions with our imaginary Subject Matter Expert.
    
##*Suggestions for improvements are always welcome!*

--S
slowe@thoughtworks.com
