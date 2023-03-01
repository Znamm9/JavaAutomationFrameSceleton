To run tests locally with selenium grid rud hub with node first
```bash
cd src/main/resources
java -jar selenium-server-4.8.1.jar standalone
```

to run your hub use commands:
```bash
java -jar selenium-server-4.8.1.jar
```

to attach node:
```bash
java -jar selenium-server-4.8.1.jar node --detect-drivers true
```