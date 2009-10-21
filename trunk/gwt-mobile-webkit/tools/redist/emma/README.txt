Files in this directory
-----------------------

emma-2.0.5312-src.zip : the pristine emma src that can be downloaded from
sourceforge.net 

emma-multiclassloader-fix.patch: the patch to the emma src to
get aroud the classloader issue.  

emma.jar: the jar file produced by the patched emma version 2.0.5312.  The emma
version was mistakenly left off of the filename, so the jar was later copied to
emma-2.0.5312-patched.jar.  The two jar files are identical.

emma-2.0.5312-patched.jar: the jar file produced by the patched emma.  This jar
is identical to emma.jar.

emma_ant-2.0.5312.jar: the jar file containing custom EMMA ant tasks that can be
downloaded from sourceforge.net.

com.mountainminds.eclemma.core_1.3.2.jar : eclemma jar containing the updated
emma.jar


To apply the emma patch file  on a unix system:
------------------------------
1. mkdir updated-emma; cd updated-emma; unzip ../emma-2.0.5312-src.zip
2. dos2unix emma-2.0.5312/core/java12/com/vladium/emma/data/CoverageData.java
3. patch -p0 < ../emma-multiclassloader-fix.patch


Updating eclemma when working with eclipse
-----------------------------------------

1. Follow instructions at http://www.eclemma.org/installation.html to install
eclemma. 

2. Replace com.mountainminds.eclemma.core_1.3.2.jar in your eclipse plugins
directory with the file of the same name in this directory. 

3. Restart eclipse. 
