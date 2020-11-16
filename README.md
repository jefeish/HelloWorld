# HelloWorld

## Build

### Maven

Create a single executable JAR.
> output destination: 'target/SimpleWebApp-1.0-SNAPSHOT-jar-with-dependencies.jar'

```bash
mvn clean compile package assembly:single install
```

---

## Run

### Command

`java -jar \<path-to-jar>/\<executable-jar> [port]`

> Note: If no [port] is provided, the default is '8090'

### Sample

```bash
java -jar HelloWorld-1.0-SNAPSHOT-jar-with-dependencies.jar 8091
```

---

## Contributing

If you have suggestions for how the app could be improved, or want to report a bug, open an issue! We'd love all and any contributions.

For more, check out the [Contributing Guide](CONTRIBUTING.md).

## License

[ISC](LICENSE) © 2020 Jürgen Efeish, <jefeish@github.com>