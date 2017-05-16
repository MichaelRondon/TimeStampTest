call mvn clean package
echo ---------------------------------------
echo ---------------------------------------
echo Starts local timestamp-test image building:
echo ---------------------------------------
echo ---------------------------------------
pause
docker build -t timestamp-test .
