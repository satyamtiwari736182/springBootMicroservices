1. API Gateway Responsibilities
    
    * Routing: Direct requests to appropriate microservices

    * Authentication: Validate JWT tokens (locally using public key)

    * Authorization: Check roles/permissions from JWT claims

    * Rate Limiting: Protect services from excessive requests

    * Request/Response Transformation: Modify headers/payloads

    * Caching: Cache common responses (e.g., public user data)

    * Circuit Breaking: Fail gracefully if a service is down

    * SSL Termination: Handle HTTPS encryption

2. AuthService Responsibilities
    User Authentication:

    * Handle login/logout

    * Generate/refresh JWT tokens

    * Token Management:

    * Sign tokens with RSA private key

    * Maintain JWKS endpoint for public keys

    * Password Security:

    * Store only password hashes (bcrypt/scrypt/Argon2)

    * Never store plaintext passwords

    * OAuth/SSO Integration: Federated identity (Google, GitHub, etc.)

Stores:

    username (PK)

    password_hash (hashed)

    account_status (active/locked)

    roles (e.g., ROLE_USER)


3. UserService Responsibilities
User Profile Management:

    * CRUD operations for user data

    * Registration (via API Gateway → AuthService coordination)

    * Personal Data Storage:

    * Email, name, address, preferences

    * Profile images/metadata

    * Data Validation:

    * Unique email/username checks

    * Profile completeness rules

Stores:

    user_id (PK, UUID)

    username (FK to AuthService)

    email, first_name, last_name

    profile_data (JSON blob for preferences)



4. Other Microservices (e.g., OrderService)
Domain-Specific Logic: Handle orders/products/etc.

    * User Context: Use X-User-ID from gateway

    * Minimal User Data: Cache only what’s needed (e.g., user_id + roles)

Stores:

    References to user_id (no personal data)

    Service-specific data (e.g., order_history)