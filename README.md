# AntiRefreshCrystal

A Minecraft mod that prevents end crystals from randomly refreshing their state, providing more consistent and predictable crystal behavior.

## Overview

**AntiRefreshCrystal** solves the frustrating issue where end crystals occasionally reset or refresh without apparent reason. This mod ensures that crystals maintain their intended state until intentionally broken or triggered, improving gameplay reliability in crystal-based mechanics and farms.

## Features

- **Eliminates Random Refreshes**: Prevents end crystals from unexpectedly resetting their state
- **Maintains Game Balance**: Does not alter crystal mechanics beyond fixing the refresh bug
- **Server & Client Compatible**: Works in both singleplayer and multiplayer environments
- **Lightweight**: Minimal performance impact with zero configuration required

## Installation

### Steps
1. Ensure Fabric Loader is installed
2. Download the latest version of AntiRefreshCrystal
3. Place the `.jar` file in your `mods` folder
4. Launch Minecraft

## Compatibility

### Works Well With
- Most crystal-based mods and utilities
- PvP-oriented modpacks
- Technical Minecraft setups

### Known Incompatibilities
- **CrystalOptimizer** - Using both mods simultaneously may cause crystals to become excessively reduced
- Other mods that significantly alter end crystal behavior

## Technical Details

This mod addresses specific edge cases in Minecraft's end crystal entity handling where internal state tracking could cause unnecessary refreshes. It intercepts and modifies the refresh logic while maintaining all intended game mechanics.

## Support

- **Issues**: Please report any bugs or unexpected behavior on our [GitHub Issues page](https://github.com/wxlksy/AntiRefreshCrystal/issues)
- **Suggestions**: Feature requests and feedback are welcome

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.

## Credits

**Author**: Psychodreams 
