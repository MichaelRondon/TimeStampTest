call mvn clean package
echo ---------------------------------------
echo ---------------------------------------
echo Starts local timestamp-test image building:
echo ---------------------------------------
echo ---------------------------------------
pause
docker build -t timestamp-test .
echo ---------------------------------------
echo ---------------------------------------
echo Executing timestamp-test image:
echo ---------------------------------------
echo ---------------------------------------
pause
docker login
docker tag timestamp-test mfrondon/timestamp-test:1.0
docker push mfrondon/timestamp-test:1.0
docker run -p 4000:8080 mfrondon/timestamp-test:1.0