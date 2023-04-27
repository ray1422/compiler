# Compiler Design Project 4
## Environment
### JAVA
```
java --version
openjdk 11.0.17 2022-10-18
OpenJDK Runtime Environment (build 11.0.17+1)
OpenJDK 64-Bit Server VM (build 11.0.17+1, mixed mode)
```
### ANTLR
I use prebuilt binary from PACMAN (Arch Linux), version 4.11.1
runtime jar is included in repository.

## Result
Due to different version of ANTLR, it's hard to ensure the result is identical with the given one. For example, the term 'bool_term1' is not assigned but appeared in the reference result.

Due the scoring method, I can't do any optimization with the CFG to make it pretties. For example,
```
declarations -> 'something' declarations | $\ellison$ ;
```
I can't rewrite it with
```
declarations -> declaration | $\ellison$;
declaration -> 'something';
```
As it causes different parsing tree although it represents the same thing.

I knew it makes hard for TA to grading the assignments without fixed specification, but I consider that copying the given CFG into program does help us study anything and it's boring & wasting time.