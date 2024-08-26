# OWNER API Advanced Features

This guide summarizes key points for advanced usage, including custom loading strategies and singleton management.

## Loading Strategies

### Customizing Property Sources
- **Definition**: Use the `@Sources` annotation to specify multiple sources for properties files.
- **Loading Order**:
  - The OWNER API tries to load properties from each specified source in order.
  - Only the first available properties file is used if `@LoadPolicy(LoadType.FIRST)` is applied.
  - When using `@LoadPolicy(LoadType.MERGE)`, properties are merged from all sources, with values from earlier sources overriding those from later ones.

### `@Sources` Annotation
- **Purpose**: Allows specifying multiple property sources, such as user home directories, system directories, and classpath resources.
- **Example**: 
  - `@Sources({ "file:~/.myapp.config", "file:/etc/myapp.config", "classpath:foo/bar/baz.properties" })`
  - **Behavior**: Properties are loaded from the first available source in the list.

### Load Policies
- **`@LoadPolicy(LoadType.FIRST)`**:
  - **Behavior**: Only the first available properties file is loaded. Others are ignored.
  - **Use Case**: Suitable when only one properties file is expected or needed.
  
- **`@LoadPolicy(LoadType.MERGE)`**:
  - **Behavior**: Properties are merged from all specified sources. The first source defining a property will prevail.
  - **Use Case**: Useful for combining properties from multiple sources with overriding capabilities.

## Singleton Pattern and `ConfigCache`

### Managing Singleton Instances
- **Issue**: Using `ConfigFactory.create()` results in new instances each time it is called, which might be impractical for complex applications.
- **Solution**: Use `ConfigCache` to manage singleton instances effectively.

### `ConfigCache` Usage
- **Singleton Behavior**:
  - **`ConfigCache.getOrCreate(MyConfig.class)`**: Retrieves a singleton-like instance from the cache.
  - **Example**: Two calls to `ConfigCache.getOrCreate(MyConfig.class)` return the same instance.
  
- **Using IDs with `ConfigCache`**:
  - **Purpose**: Assign an ID to instances to differentiate between configurations.
  - **Example**: 
    - `ConfigCache.getOrCreate("foo", MyConfig.class)` and `ConfigCache.getOrCreate("foo", MyConfig.class)` return the same instance.
    - `ConfigCache.getOrCreate("bar", MyConfig.class)` returns a different instance.

### Listing and Managing Configurations
- **Listing Configurations**:
  - **Purpose**: Retrieve all configuration objects for debugging or management.
  - **Method**: `ConfigCache.list()` returns a set of IDs for all cached configurations.

### Thread Safety
- **Design**: `ConfigCache` is designed to be thread-safe, ensuring safe concurrent access.

## Example Usage

- **Configuration Management**: Use `ConfigCache` for a centralized and efficient way to manage configuration instances, avoiding the overhead of multiple instance creation and manual management.
- **Integration**: Utilize `@Sources` and `@LoadPolicy` annotations to tailor property loading strategies according to application needs, ensuring flexibility and control over configuration management.
