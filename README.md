# meta-monogateway

This repository provides the Yocto build configuration for the Mono Gateway, targeting the NXP LS1046A processor. It includes the necessary layers, recipes, and configurations to build a customized Linux distribution for the Mono Gateway.

## Features
- Yocto-based build system
- Support for NXP LS1046A SoC
- Custom recipes for Mono Gateway-specific components
- Secure and optimized Linux environment
- Integrated network and security features

## Build Instructions
The build process for this repository is handled through the [gateway-build-container](https://github.com/egrissino/gateway-build-container) repository. This containerized environment includes all necessary dependencies and setup scripts.

To build, follow the instructions provided in the [gateway-build-container](https://github.com/egrissino/gateway-build-container) repository.

## Layers Included
The following Yocto layers are included:
- **poky** - Core Yocto Project build system
- **meta-openembedded** - Additional open-source package support
- **meta-freescale** - Support for NXP LS1046A
- **meta-monogateway** - Custom Mono Gateway-specific configurations and recipes

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository
2. Create a feature branch
3. Commit your changes with descriptive messages
4. Submit a pull request

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Support
For issues and support, please open an issue in the repository or contact `evanjgrissino@gmail.com`.

