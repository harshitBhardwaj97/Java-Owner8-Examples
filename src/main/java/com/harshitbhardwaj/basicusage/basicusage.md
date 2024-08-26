# OWNER API Basic Usage

This guide summarizes the key points for basic usage, including how to handle property file locations and annotations.

## Key Concepts

### Properties Mapping Interface
- **Definition**: Create a Java interface extending `org.aeonbits.owner.Config`.
- **Purpose**: Maps properties from a file to methods in the interface.
- **File Location**: The properties file does not have to be in the same package as the interface. OWNER API automatically associates the properties file based on the interface name with a `.properties` suffix. This behavior can be customized using annotations.

### Automatic Mapping
- **How It Works**: OWNER API resolves the properties file by matching the interface class name with the properties file name (`ClassName.properties`). For example, an interface `ServerConfig` will automatically look for `ServerConfig.properties` unless specified otherwise.

### Annotations

#### `@DefaultValue`
- **Purpose**: Provides a default value if the property is missing in the properties file.
- **Example**: `@DefaultValue("42")` sets a default value of `42` for a property if it is not found.

#### `@Key`
- **Purpose**: Customizes the property key if it differs from the method name.
- **Example**: `@Key("server.http.port")` maps the property `server.http.port` to the method `port()`.

## Undefined Properties
- **Behavior**:
  - **Object Data Types**: Methods returning **object types (e.g., `String`, `Boolean`, `Double`)** for properties not defined in the properties file, **will return `null` if no default value is provided**. 
  - **Primitive Data Types**: Methods returning **primitive types (e.g., `int`, `boolean`, `double`) will throw a `NullPointerException`**, if the property is not defined, **and no default value is specified**. 

### Development Flexibility
- **Default Values**: Use `@DefaultValue` during development. Properties files can be added or updated later.