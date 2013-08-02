public_html
===========

My playground for my public_html servlet application.

I needed a quick way to duplicate my public_html web application, so I decided to play 
with using git to create a repo/application all in one.  

The overall strategy is to use a servlet to hide the .git directory and to use a src/main/java structure 
under the WEB-INF directory so one can go in there and run make/ant/maven (haven't decided yet what to do there...) 
