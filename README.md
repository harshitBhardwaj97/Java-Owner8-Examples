# Configuration Management with OWNER API

This repository demonstrates how to use the OWNER API to handle configuration management in Java applications. It includes examples of basic usage, some advanced features, and integration patterns. To refer the official documentation of [Owner API](https://matteobaccan.github.io/owner/), visit here. 

## Benefits Over Traditional Properties Approach

Using the OWNER API offers several advantages compared to the traditional `Properties` class approach:

1. **Type Safety**: OWNER API provides type-safe access to configuration values. Instead of dealing with `String` values and manually converting them to the required types, you define the expected return types directly in the interface. This eliminates potential runtime errors due to type mismatches.

2. **Default Values**: With OWNER API, you can easily specify default values for properties using the `@DefaultValue` annotation. This ensures that your application can handle missing properties gracefully without additional error handling code.

3. **Annotations for Customization**: OWNER API uses annotations like `@Key` to map properties to methods in a more flexible and readable manner. This makes it easier to handle different naming conventions and property structures.

4. **Automatic File Resolution**: OWNER API simplifies file resolution by automatically associating properties files based on interface names, reducing the need for manual file handling and configuration.

5. **Advanced Loading Strategies**: OWNER API supports advanced loading strategies such as `@LoadPolicy(LoadType.MERGE)`, which allows merging properties from multiple sources. This feature is useful for applications that need to aggregate configurations from different environments or sources.

6. **Singleton Management**: The `ConfigCache` feature in OWNER API provides a convenient way to manage configuration instances as singletons, reducing boilerplate code and ensuring consistent configuration access across the application.

Thus by using the OWNER API, you can make configuration management **more robust, maintainable, and scalable**, when compared to traditional properties handling.

## Project Overview

This project showcases how to leverage the OWNER API, to manage configuration settings effectively. It includes:

- **Basic Usage**: A guide to setting up and using the OWNER API for simple property mappings.
- **Advanced Features**: Examples of more advanced use cases such as Singleton patterns and property file merging.
- **Sample Code**: Practical examples of how to create and manage configuration interfaces, handle property sources, and apply load policies.

## Key Features

### Basic Usage
- **Properties Mapping**: Maps properties from files to Java interface methods.
- **Automatic File Resolution**: Automatically associates properties files based on interface names.
- **Annotations**: Customize property mappings using `@Key`, `@DefaultValue`, and more.

### Advanced Features
- **Singleton Pattern**: Manage configuration instances using `ConfigCache` for Singleton-like behavior.
- **Load Policy**: Merge properties from multiple sources using `@LoadPolicy(LoadType.MERGE)`.