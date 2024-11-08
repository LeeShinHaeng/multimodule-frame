package com.delivery.api.account;

import com.delivery.api.account.model.AccountMeResponse;
import com.delivery.db.account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class AccountApiController {
	private final AccountRepository accountRepository;

	// http://localhost:8080/api/account/me
	@GetMapping("/me")
	public AccountMeResponse me() {
		return AccountMeResponse.builder()
			.email("hong@email.com")
			.name("홍길동")
			.registeredAt(LocalDateTime.now())
			.build();
	}
}
