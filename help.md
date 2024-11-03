# Minecraft Fabric Modding Help

## Useful sites

- [Recipes Help](https://misode.github.io/recipe/)
- [Loot Tables Help](https://misode.github.io/loot-table/)
- [Any](https://misode.github.io/)
- [Formatting codes](https://minecraft.wiki/w/Formatting_codes)

## Useful commands

To generate readable source files for minecraft. Run once at start:

```bash
./gadlew genSources
```

To launche Minecraft in a dev env to test mod:

```bash
./gradlew runClient
```

To start a dedicated server instance to test multiplayer functionnality:

```bash
./gradlew runServer
```

To Compile and packages the mod in .jar file in build/libs. Use when ready for distribution:

```bash
./gradlew build
```

To delete previous build artifacts, forcing rebuild from scratch:

```bash
./gradlew clean
```

To list all dependencies:

```bash
./gradlew dependencies
```
