@if "%GWT_HOME%"=="" goto needGWTHome
@java -Xmx128M -cp "%~dp0\..\..\src;%~dp0\..\..\bin;%GWT_HOME%\gwt-user.jar;%GWT_HOME%\gwt-dev-windows.jar;..\..\..\..\gwt-html5-storage.jar" com.google.gwt.dev.Compiler -war "%~dp0\..\..\war" %* com.google.code.gwt.storage.sample.storage.HelloStorage
@exit /B %ERRORLEVEL%

:needGWTHome
@echo The environment variable GWT_HOME is not defined, it should point to a valid GWT installation.
@exit /B 1